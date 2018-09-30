" plugins.vim
"

call plug#begin('$VIM_HOME/plugged')

" Define plugins to load into VIM
let plugins_enabled=[
\   'appearance', 'vcs', 'search', 'editor',
\   'themes'
\   ]
for plugin in plugins_enabled
    let plugin_path = $VIM_HOME . '/plugins.' . plugin . '.vim'
    if filereadable(plugin_path)
        execute 'source ' . plugin_path
    endif
endfor

call plug#end()
