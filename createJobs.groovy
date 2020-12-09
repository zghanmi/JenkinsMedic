pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }

pipelineJob('theme-park-job') {
    definition {
		spsScp{
			scm {
				git{
					remote{
						url 'https://github.com/zghanmi/medic'
					}
					branch 'master'
				}
			}
		}
	}
}