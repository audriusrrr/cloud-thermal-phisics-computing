FROM hdmet/comsol:5.4.0
# TO-DO: fix alias so it would woek in CMD
RUN echo 'alias comsol="/opt/app/comsol54/multiphysics/bin/comsol"' >> ~/.bashrc
COPY input.mph input.mph

# TO-DO: define path to input file and it's name through ENVIRONMENT VARIABLE.
# TO-DO: write sh script that takes the output file and saves it to external storage.
# TO-DO: amend the CMD accordingly after above chnages are implemented.
CMD ["/opt/app/comsol54/multiphysics/bin/comsol", "batch", "-inputfile", "/tmp/input.mph", "-outputfile", "/tmp/output.mph"]