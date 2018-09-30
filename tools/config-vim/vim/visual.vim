" visual.vim
"

" Enable syntax highlighting
syntax on

" Line # on
set number
" Enable relative # for line
set relativenumber
" Show ruler
set ruler
" Always show tab pannel
set showtabline=4
" Show the command typing
set showcmd
" Show matching brackets
set showmatch
" Bracket blinking
set matchtime=5
" Hide the current mode
set noshowmode
" Mark 80th column with a hihghlight color
if exists('+colorcolumn')
    set colorcolumn=80
    highlight ColorColumn ctermbg=gray
endif
" Highlight current line
set cursorline
" Show cursorline for active window only
augroup highlight_active_window
    autocmd!
    autocmd BufEnter * setlocal cursorline
    autocmd BufLeave * setlocal nocursorline
augroup END
" No blinking
set novisualbell
" No noise
set noerrorbells
" Minimal # of screen lines to keep above and below the cursor
set scrolloff=3
" Always show status line
set laststatus=2
" No conceal
set conceallevel=0
" Use a block cursor in normal mode, i-beam cursor in insertmode
if empty($TMUX)
    let &t_SI= "\<Esc>]50;CursorShape=1\x7"
    let &t_EI= "\<Esc>]50;CursorShape=0\x7"
else
    let &t_SI= "\<Esc>Ptmux;\<Esc>\<Esc>]50;CursorShape=1\x7\<Esc>\\"
    let &t_EI= "\<Esc>Ptmux;\<Esc>\<Esc>]50;CursorShape=0\x7\<Esc>\\"
endif

""" Match and search {{{
"   Highlight searches
set hlsearch
"   Ignore case of searches
set ignorecase
"   be sensitive when ther's a capital letter
set smartcase
"   Highlight dynamically as pattern is typed
set incsearch
""" }}}
