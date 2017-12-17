# .vimrc Sample

```
" General
syntax enable             " syntax 하이라이트
set nobackup              " 백업파일 생성안함
set history=1000          " history 설정 = 1,000

" UI
set number                " 좌측에 줄번호
set relativenumber        " 줄번호 상대적으로 표시
set visualbell            " 비주얼벨 사용
set hlsearch              " 검색어 강조
set showmatch             " 괄호 매칭

" Formatting
set cindent               " c스타일 들여쓰기
set autoindent            " 자동들여쓰기
set smartindent           " 지능적인 들여쓰기
set expandtab             " tab 대신 스페이스 사용
set tabstop=4             " 탭간격 4
set softtabstop=4         " 탭간격 4
set shiftwidth=4          " 들여쓰기간격 4
set paste                 " 그대로 붙여넣기
set ignorecase            " 검색시 대소문자 구분 안함

autocmd FileType make setlocal noexpandtab  " Makefile은 tab을 사용함
```
