FROM gitpod/workspace-full:branch-jx-fix-rustc-bash-completion

ENV TRIGGER_REBUILD 3

# Install custom tools, runtimes, etc.
# For example "bastet", a command-line tetris clone:
# RUN brew install bastet
#
# More information: https://www.gitpod.io/docs/config-docker/
