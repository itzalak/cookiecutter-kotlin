# Cookiecutter Base

Simple cookiecutter for my personal projects.

Simple and straightforward, no language configuration.

## Configuration

- [release please](https://github.com/googleapis/release-please) for github actions
- [commitizen](https://commitizen-tools.github.io/commitizen/) for github actions
- [pre commit config](https://github.com/pre-commit/pre-commit)
- [markdown lint](https://github.com/igorshubovych/markdownlint-cli)
- [conventional commits](https://www.conventionalcommits.org/en/v1.0.0/)
- [makefile](https://makefiletutorial.com/)

### Release please

For using release please, github actions requires permissions for creating and approving pull requests.

In `Settings > Actions > General` find `Workflow permissions` and update

- `Read and write permissions`
- `Allow Github Actions to create and aprove pull requests`

## Use

To create a repository using a cookie cookiecutter template

```shell
cookiecutter https://github.com/itzalak/cookiecutter-java-kotlin.git
```

## Cookiecutter

- <https://github.com/cookiecutter/cookiecutter>
- <https://cookiecutter.readthedocs.io/en/stable/>
- <https://www.cookiecutter.io/templates>
