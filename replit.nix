{ pkgs }: {
    deps = [
      pkgs.systemdMinimal
      pkgs.docker
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}