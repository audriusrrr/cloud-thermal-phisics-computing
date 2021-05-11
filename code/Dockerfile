FROM hdmet/comsol:5.4.0
# TO-DO: fix alias so it would woek in CMD
RUN echo 'alias comsol="/opt/app/comsol54/multiphysics/bin/comsol"' >> ~/.bashrc
# TO-DO: define path to input file and it's name through ENVIRONMENT VARIABLE.
# TO-DO: write sh script that takes the output file and saves it to external storage.
# TO-DO: amend the CMD accordingly after above chnages are implemented.
#CMD ["ls", "/opt/app/comsol54/multiphysics/bin/"]
CMD ["/opt/app/comsol54/multiphysics/bin/comsol", "compile", "/home/src/main/Main.java", "&&", "/opt/app/comsol54/multiphysics/bin/comsol", "batch", "-inputfile", "/home/src/main/Main.class", "-outputfile", "/home/src/main/Main.mph", "-batchlog", "/home/src/main/Main.log"]
#/opt/app/comsol54/multiphysics/bin/comsol batch -inputfile Main.class -outputfile Main.mph -batchlog Main.log
#/opt/app/comsol54/multiphysics/bin/comsol compile /fakehome/admin0/src/main/Main.java