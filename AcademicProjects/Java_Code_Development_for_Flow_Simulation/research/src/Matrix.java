import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Matrix {
    int progress = 0;
    int n;
    double H,Length,DeltaPressure,Nu;
    double[][] A;// // populated in GENERATE
    double[] b;//
    double[] EV;//
    double[] Y_j_array;//
    double[][] L;// //populated in GENERATE
    double[][] U;// populated in GENERATE
    double[] AbsoluteError;//
    double[] RelativeError;//
    double[] x;//
    double[] y;//
    String[] TableString;
    String[][] TableStringGUI;

    int IntInput(String prompt){
        System.out.print(prompt + ": ");
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }

    double doubleInput(String prompt){
        System.out.print(prompt + ": ");
        Scanner read = new Scanner(System.in);
        return read.nextDouble();
    }

    void GENERATE(){ //this.n
        int j = 0;
        for (int i = 0; i < this.n; i++) {

            this.A[i][i] = 2.0d;
            this.L[i][i] = 1.0d;

            if (j == this.n - 1) break;
            j++;
            this.A[i][j] = -1.0d;
            this.A[j][i] = -1.0d;
        }

        this.U = this.A.clone();

    }

    void DECOMP(){
        double factor;
        for (int j = 0; j < this.n-1; j++) {

            for (int i = j + 1; i < this.n; i++) {
                factor = this.U[i][j] / this.U[j][j];
                this.L[i][j] = factor;

                for (int k = 0; k < this.n; k++) {
                    this.U[i][k] = this.U[i][k] - (factor * this.U[j][k]);
                }

            }

        }
    }
    void FORWARD_SUB(){
        double sum_row;
        for (int i = 0; i < this.n; i++) {
            sum_row = 0;
            for (int j = 0; j < i; j++) {
                sum_row = sum_row + this.L[i][j] * y[j];
            }
            y[i] = (-1 * sum_row) + this.b[i];
        }

    }

    void BACKWARD_SUB(){
        double sum_row;
        for (int i = this.n-1;i > -1; i--) { //U matrix: NxN, x vector: n+2

            sum_row = 0;
            for (int j = i; j < this.n ; j++) {
                sum_row = sum_row + this.U[i][j] * this.x[j];
            }

            this.x[i] = ((-1 * sum_row) + this.y[i]) / this.U[i][i];
        }

    }

    void CalcErrors(){
        for (int i = 0; i < this.n; i++) {
            this.AbsoluteError[i] = Math.abs(this.x[i] - this.EV[i+1]);
            this.RelativeError[i] = Math.abs(this.AbsoluteError[i] / this.EV[i+1]);

        }
    }

    void ShowTable(){ // TODO i , Y_j_array[i+1], Solution[i], EV[i+1], Absolute_error[i], Relative_error[i]
        //https://www.codegrepper.com/code-examples/python/how+to+create+table+format+python+console+output+without+library

        System.out.printf("|%8s | %30s | %30s | %30s | %30s | %30s|","k","Y_j","Solution","Exact Solution","Absolute Error","Relative Error");
        System.out.println("");
        System.out.printf("|%8s | %30s | %30s | %30s | %30s | %30s|",0,-this.H,0.0,0.0,0.0,0.0);
        System.out.println("");

        int tempI = 0;

        for (int i = 0; i < this.n; i++) {

            System.out.printf("|%8s | %30s | %30s | %30s | %30s | %30s|",i+1,this.Y_j_array[i+1],this.x[i],this.EV[i+1],this.AbsoluteError[i],this.RelativeError[i]);
            System.out.println("");
            tempI = i;
        }
        System.out.printf("|%8s | %30s | %30s | %30s | %30s | %30s|",tempI+2,this.H,0.0,0.0,0.0,0.0);
        System.out.println("");
    }

     void ShowTableNestedArray(boolean GUI){ // TODO i , Y_j_array[i+1], Solution[i], EV[i+1], Absolute_error[i], Relative_error[i]
        //https://www.codegrepper.com/code-examples/python/how+to+create+table+format+python+console+output+without+library
        int i = 0;
        String[][] tempString = new String[n+2][6];


        i = 0;
        for(String elem: String.format("%8s , %30s , %30s , %30s , %30s , %30s \n",0,-this.H,0.0,0.0,0.0,0.0).split(",")){
        tempString[1][i] = elem;
        int tempI = 0;
        i++;

        }
        int i2 = 0;
        int tempI = 0;
        for (i = 0; i < this.n; i++) {
            tempI = i;
            i2 = 0;
            for(String elem:String.format("%8s , %30s , %30s , %30s , %30s , %30s \n",0,-this.H,0.0,0.0,0.0,0.0).split(",")){
            {
            tempString[i][i2] = elem;
            i2++;

            }
        }

        }


        i = 0;
        for(String elem: String.format("|%8s | %30s | %30s | %30s | %30s | %30s| \n",tempI+2,this.H,0.0,0.0,0.0,0.0).split(",")) {
            tempString[tempString.length-1][i] = elem;
            i++;
        }
        this.TableStringGUI = tempString;
    }

       void ShowTableArray(){
        String[] tempString = new String[n+3];
        tempString[0] = String.format("%8s , %30s , %30s , %30s , %30s , %30s \n","k","Y_j","Solution","Exact Solution","Absolute Error","Relative Error");
        tempString[1] = String.format("%8s , %30s , %30s , %30s , %30s , %30s \n",0,-this.H,0.0,0.0,0.0,0.0);

        for (int i = 0; i < this.n; i++) {
            tempString[i] = String.format("%8s , %30s , %30s , %30s , %30s , %30s", i + 1, this.Y_j_array[i + 1], this.x[i], this.EV[i + 1], this.AbsoluteError[i], this.RelativeError[i]);
        }

        this.TableString = tempString;

    }

    void Matprint(double[][] arr){
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.print("\n");

        }
    }

    void Matprint(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\n");
        }
    }

    public void cmdExecute() throws IOException {
        //https://www.edureka.co/community/358/how-to-execute-a-python-file-with-few-arguments-in-java
//        String cmd[] = { "python", " Graph.py" , "0.0 ,"+Arrays.toString(this.x).replace("[","").replace("]",""),           };
//        Process command = Runtime.getRuntime().exec("python Graph.py "+ "0.0 ,"+Arrays.toString(this.x).replace("[","").replace("]","")+", 0.0"  + " " + "0.0 ,"+Arrays.toString(this.y).replace("[","").replace("]","")+", 0.0" ); // TODO USE SYSTEM.ARGV
//        Process command = Runtime.getRuntime().exec("python Graph.py "+ "0.0 ,"+Arrays.toString(this.x).replace("[","").replace("]","")+", 0.0"  + " " + "0.0 ,"+Arrays.toString(this.y).replace("[","").replace("]","")+", 0.0" ); // TODO USE SYSTEM.ARGV
        Process command = Runtime.getRuntime().exec("python Graph.py");


    }
    // TODO GUI

    public Matrix() throws IOException {

        this.n = IntInput("Enter number of discrete points to evaluate");
        this.H = doubleInput("Enter radius of artery"); //take user input
        this.Length = doubleInput("Enter length of artery"); //take user input
        this.DeltaPressure = doubleInput("Enter delta pressure"); //take user input
        this.Nu = doubleInput("Enter viscosity"); //take user input
        double DeltaY = (2 * H) / (n+1);
        double V_max =  (this.DeltaPressure * Math.pow(H,2)) / (2 * this.Nu * this.Length);
        double F_j =  ((Math.pow(DeltaY,2) * (2 * V_max)) / (Math.pow(H,2)));

        for (int i = 0; i < this.n+1; i++) {

            this.Y_j_array[i] = -H + i * DeltaY;
        }

        for (int i = 1; i < this.n+1; i++) {
            this.EV[i] =  (V_max * (1 - Math.pow(Y_j_array[i] / H, 2)));
        }

        for (int i = 0; i < this.n; i++) {
            this.b[i] = F_j;

        }

        this.GENERATE();
        this.DECOMP();
        this.A = null; // get rid of memory space allocated to A
        this.FORWARD_SUB();
        this.L = null;
        this.BACKWARD_SUB();
        this.U = null;
        this.y = null;
        this.CalcErrors(); // calculate ERRORS
        this.ShowTable();
        this.AbsoluteError = null;
        this.RelativeError = null;
        FileWriter delete = new FileWriter("points.txt");
        delete.write("");
        delete.flush();
        delete.close();

        FileWriter write = new FileWriter("points.txt");
        write.write(String.valueOf(this.n+2)+"\n");
        write.write("0.0 ,"+Arrays.toString(this.x).replace("[","").replace("]","")+", 0.0" + "\n");
        write.write((Arrays.toString(this.Y_j_array)+", "+this.H).replace("[","").replace("]","")+ "\n"); //TODO CHECK IF THIS INCLUDES BOUNDARY CONDITIONS
        write.flush();
        write.close();

        this.cmdExecute();

    }

    public Matrix( int n, double l, double DeltaP, double H,double Nu) throws IOException {
        this.n = n;
        this.H = H;
        this.Length = l;
        this.DeltaPressure = DeltaP;
        this.Nu = Nu;

        this.A = new double[n][n];
        this.b = new double[n];
        this.EV = new double[n+1];
        this.Y_j_array = new double[n+1];
        this.L = new double[n][n];
        this.U = new double[n][n];
        this.AbsoluteError = new double[n];
        this.RelativeError= new double[n];

        this.x = new double[n];
        this.y = new double[n];

        this.TableStringGUI = new String[n+3][6];

        double DeltaY = (2 * H) / (n+1);
        double V_max =  (this.DeltaPressure * Math.pow(H,2)) / (2 * this.Nu * this.Length);
        double F_j =  ((Math.pow(DeltaY,2) * (2 * V_max)) / (Math.pow(H,2)));
        this.progress = this.progress + 6;
        MainMenu.jProgressBar1.setValue(this.progress);

        for (int i = 0; i < this.n+1; i++) {

            this.Y_j_array[i] = -H + i * DeltaY;
        }
        this.progress = this.progress + 6;
        MainMenu.jProgressBar1.setValue(this.progress);

        for (int i = 1; i < this.n+1; i++) {
            this.EV[i] =  (V_max * (1 - Math.pow(Y_j_array[i] / H, 2)));
        }
        this.progress = this.progress + 6;
        MainMenu.jProgressBar1.setValue(this.progress);

        for (int i = 0; i < this.n; i++) {
            this.b[i] = F_j;
        }
        this.progress = this.progress + 7;
        MainMenu.jProgressBar1.setValue(this.progress);

        this.GENERATE();
        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);

        this.DECOMP();
        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);
        this.A = null;

        this.FORWARD_SUB();
        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);
        this.L = null;
        this.b = null;

        this.BACKWARD_SUB();
        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);
        this.U = null;
        this.y = null;

        this.CalcErrors(); // calculate ERRORS
        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);

        this.ShowTableNestedArray(true);

        this.progress = this.progress + 11;
        MainMenu.jProgressBar1.setValue(this.progress);



        // delete the contents of the file(the previous points)
        FileWriter delete = new FileWriter("points.txt");
        delete.write("");
        delete.flush();
        delete.close();
        this.progress = this.progress + 3;
        MainMenu.jProgressBar1.setValue(this.progress);

        FileWriter write = new FileWriter("points.txt");
        write.write(String.valueOf(this.n+2)+"\n");
        write.write("0.0 ,"+Arrays.toString(this.x).replace("[","").replace("]","")+", 0.0" + "\n");
        write.write((Arrays.toString(this.Y_j_array)+", "+this.H).replace("[","").replace("]","")+ "\n"); //TODO CHECK IF THIS INCLUDES BOUNDARY CONDITIONS
        write.flush();
        write.close();
        this.progress = this.progress + 6;
        MainMenu.jProgressBar1.setValue(this.progress);

        this.cmdExecute();

    }

}
