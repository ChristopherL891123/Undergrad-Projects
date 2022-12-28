# this file is loaded into memory when an application imports this package with the following command
# import celtstats
# imports all modules and functions from the celtstats package
from celtstats.data_io import *
from celtstats.parser import *
from celtstats.stats import *
from celtstats.viz import *
import turtle

hard_dependencies = ['turtle']
missing_dependencies = []

for dependency in hard_dependencies:
    try:
        __import__(dependency)

    except ImportError as e:
        missing_dependencies.append(dependency)

if len(missing_dependencies) != 0 :
   for dependency in missing_dependencies:
       raise ImportError("Missing required dependencies {0}".format(dependency))
   print('Missing packages error, make sure to install/import them')
   exit(-1)
