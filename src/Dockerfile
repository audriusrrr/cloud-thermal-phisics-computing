FROM hdmet/comsol:5.4.0
RUN echo 'alias comsol="/opt/app/comsol54/multiphysics/bin/comsol"' >> ~/.bashrc
COPY parallel_plates_diffuse_specular_data.txt parallel_plates_diffuse_specular_data.txt
COPY parallel_plates_diffuse_specular.mph parallel_plates_diffuse_specular.mph

# TO-DO: define path to input file and it's name through ENVIRONMENT VARIABLE.
# TO-DO: write sh script that takes the output file and saves it to external storage.
# TO-DO: amend the CMD accordingly after above chnages are implemented.
CMD ["/opt/app/comsol54/multiphysics/bin/comsol", "batch", "-inputfile", "/tmp/parallel_plates_diffuse_specular.mph", "-outputfile", "/tmp/COULD-TEST.mph", "echo", "completed: file transfer not implemented yet"]