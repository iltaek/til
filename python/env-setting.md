#env-setting

파이썬 개발환경 설정
* pyenv - 로컬 파이썬 버전 관리
* virtualenv - 프로젝트별 파이썬, 패키지 관리
* autoenv - 프로젝트 폴더마다 개발환경 자동 설정

## pyenv, pyenv-virtualenv 설치

homebrew를 이용한 설치
```
$ brew update
$ brew install pyenv
$ brew install pyenv-virtualenv
```

`.zshrc` 에 환경변수 설정 추가
```
export PATH="$HOME/.pyenv/bin:$PATH"
eval "$(pyenv init -)"
eval "$(pyenv virtualenv-init -)"
```

설치한 pyenv로 원하는 파이썬 버전 설치
```
# 현재 설치된&사용하고있는 파이썬 버전들 확인
$ pyenv versions

# pyenv로 설치 가능한 파이썬 버전 확인
$ pyenv install -list

# 본인은 anaconda3-5.0.1로 설치
$ pyenv install anaconda3-5.0.1
```

설치된 버전들 확인 및 사용
```
# 설치된 버전들 확인
$ pyenv versions

# 현재 shell 상의 버전 변경
$ pyenv shell anaconda3-5.0.1
(anaconda3-5.0.1)$ pyenv versions
```

## pyenv로 virtualenv 사용

기본적으로 `pyenv virtualenv [VERSION_NAME] [VIRTUALENV_NAME]` 형식으로 사용

```
# project1 환경 생성 (파이썬 버전 지정)
(anaconda3-5.0.1)$ pyenv virtualenv anaconda3-5.0.1 project1

# project1 환경 생성 (현재 파이썬 버전으로)
(anaconda3-5.0.1)$ pyenv virtualenv project1

# 생성한 virtualenv 사용 설정
(anaconda3-5.0.1)$ pyenv shell project1
(project1)$

# 가상환경 활성화/비활성화 -> 필요할때가 있음
$ pyenv activate project1
(project1)$ pyenv deactivate
$

# 가상환경 삭제
$ pyenv uninstall project1
```

## autoenv 설치 및 사용

작업 디렉토리 접근 시에 폴더 내에 존재하는 `.env` 파일을 찾아서 실행해줌

homevrew를 이용한 설치
```
$ brew install autoenv
```

`.zshrc` 에 환경변수 설정 추가
```
source $(brew --prefix autoenv)/activate.sh
```

autoenv 사용
```
# project1 폴더 생성, 들어감
$ mkdir project1 && cd project1

# .env 파일에 실행할 명령어 입력
$ echo 'pyenv shell project1' >> .env
```
