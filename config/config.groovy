buildScriptsSubmodulePath = '.'

applicationId = 'replace-me'

docker {
    file = 'docker/Dockerfile'
    maintainer = 'Axel Foley <axel.foley@beverlyhills.org>'
    registry {
        url = ''
    }
    java {
        image = 'alpine'
        tag = 'latest'
    }
}

environments {

    development {
        environment = 'development'
    }

    staging {
        environment = 'staging'
    }

    production {
        environment = 'production'
    }
}
