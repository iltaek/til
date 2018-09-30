" general.vim
"

" Let it not compatable with original vi; Make vim more useful
set nocompatible
" Use path '~/.vim' on non-unix machine
set runtimepath+=~/.vim
" Enhance command-line completion; It shows options
set wildmenu
" Ignore when expanding wildcards
set wildignore=*.swp,*.swo,*.class
" # of history that vim remember
set history=256
" Use the OS clipboard by default (on versions compiled with '+clipboard')
set clipboard=unnamed
" Optimize for fast terminal connections
set ttyfast
" Walk directory tree upto $HOME looking for tags
set tags=./tags;$HOME
" Add empty newline at the end of files
set endofline
" Automatically change window's cwd to file's dir
set autochdir
" Set path to viminfo
if !has('nvim')
	set viminfo='100,n$HOME/.viminfo
endif
" Set default shell to execute functions
set shell=sh

""" Folding {{{
"   Turn on folding
set foldenable
"   Make folding indent sensitive
set foldmethod=indent
"   Don't autofold anything
set foldlevel=99
"   Don't open folds when search into them
set foldopen-=search
"   Don't open folds when undo stuff
set foldopen-=undo
""" }}}

""" Backup & Swap {{{
"   No backup & swap files
set noswapfile
set nobackup
"   Centralize backups, swapfiles and undo history
"set backupdir=~/.vim/backups
"set directory=~/.vim/swaps
"   Maintain undo history between sessions
set undofile
"   Set maximum # of changes that can be undone
set undolevels=100
"   Change dir to save undo history
if has('persistent_undo') && !has('nvim')
	set undodir=~/.vim/cache
	if !isdirectory(&undodir)
		"   Create dir
		call mkdir(&undodir, 'p')
	endif
endif
"   Dont't create backups when editing files in certain dir
set backupskip=/tmp/*

""" Encoding {{{
set encoding=utf-8
set fileencodings=utf-8,ecu-kr
""" }}}

""" Formatting {{{
"   Set the default tabstop
set tabstop=4
set softtabstop=4
"   Set the default shift width for indents
set shiftwidth=4
"   Make tabs into spaces (set by tabstop)
set expandtab
"   Smart tab levels
set smarttab
"   Copy indent from current line when starting a new line
set autoindent
"   Do smart autoindenting when starting a new line
set smartindent
""" }}}


