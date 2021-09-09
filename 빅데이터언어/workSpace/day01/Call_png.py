
#f9 한줄실행
# 사진 출력
import urllib
import PIL

urllib.request.urlretrieve("https://www.dhnews.co.kr/news/photo/202007/126097_129193_5935.jpg","kw-img.png")

img = PIL.Image.open("kw-img.png")
d = img

print("이미지 사이즈는 얼마인가요?",d.size)

d=  d.resize((100,50))

d.show()

