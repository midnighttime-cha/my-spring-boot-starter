#/bin/bash
git add .
echo "====== git add all ======"
git commit -m "$1"
echo "====== git commit via messege: $1 ======"
git push -u origin master
echo "====== git push to master branch ======"