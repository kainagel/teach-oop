NAME=Test

############################################
############################################

# This sets the BASE variable:
BASE=/home/${USER}/vsp-cvs

# Here you can override the BASE variable:
# Goes from general to specific dir!
ifeq (../../Makefile.base,$(wildcard Makefile.base))
include ../../Makefile.base
endif
ifeq (../Makefile.base,$(wildcard ../Makefile.base))
include ../Makefile.base
endif
ifeq (Makefile.base,$(wildcard Makefile.base))
include Makefile.base
endif

# Here the BASE variable is used:
include ${BASE}/src/java/Makefile.defs

RUN := ${RUN}

include ${BASE}/src/java/Makefile.rules

############################################
############################################
