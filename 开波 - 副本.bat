@echo off

path %systemdrive%\App\VSCode;%path%

set "���Ŀ¼=.vscode\extensions"
set "�û�����Ŀ¼=.vscode\PY"

code --user-data-dir %�û�����Ŀ¼%

exit

