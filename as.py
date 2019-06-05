import requests
from bs4 import BeautifulSoup
res=requests.get("http://120.108.116.237/~jackjow/index.php")
handle=open('lineList.txt','w')
soup=BeautifulSoup(res.text,'html.parser')
print(soup.prettify())
title_tag=soup.title
print(title_tag)
print(title_tag.text)
a_tags=soup.find_all('a')
for tag in a_tags:
    print(tag.string,tag.get('href'))
    handle.write(tag.get('href'))
    handle.write('\n')