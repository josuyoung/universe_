
import turtle
t = turtle.Turtle('turtle');
# =============================================================================
# t.forward(100);
# t.left(90)
# t.forward(100);
# t.left(90);
# #alt + p , alt + n 이전명령 다음명령 복붙
# t.forward(100);
# t.left(90);
# t.forward(100);
# t.left(90);
# t.reset();
# 
# t.forward(100);
# t.left(120)
# t.forward(100);
# t.left(120)
# t.forward(100);
# t.left(120)
# t.reset();
# 
# t.forward(100)
# t.left(360/5)
# 
# t.forward(100)
# t.left(360/5)
# 
# t.forward(100)
# t.left(360/5)
# 
# t.forward(100)
# t.left(360/5)
# 
# t.forward(100)
# t.left(360/5)
# 
# t.reset()
# trl + 4 , ctrl + 5 블럭주석
# =============================================================================

# 반복문
for i in range(4):
    print(i)
    
for i in [0,1,2,3,4]:   #in 뒤에있는 값만큼 반복
    print("hello");
    
for i in [0,10,20,30]:  #순서대로 값을 넣어놓을 필요는 없음
    print("hello");
    print(i)
    
    
h = "ayello"

print(h[-1::-1])
    
for _ in range(4):  #변수를 사용하지 않을 때 언더라인 쓰기도 함
    t.forward(100)                     # 단순히 반복하려할 
    t.left(90)
    
t.reset()

for _ in range(10):     #10각형
    t.forward(100)
    t.left(360/10)
    
for _ in range(30):     #30각형
    t.forward(40)
    t.left(360/30);
    
t.reset()
n = 10
for i in range(n):
    t.forward(50)
    t.left(360/n)
    
# function(함수)
def drawSquare():
    for _ in range(4):
        t.forward(100)
        t.left(90)
        
        
# function(함수호출)
drawSquare()

for j in range(10):
    drawSquare()
    t.left(10)  #책마냥 개간지
    
def drawPolygon(n):     #parameter 가인수
    for _ in range(n):
        t.forward(100)
        t.left(360/n)    
drawPolygon(n)  # n값을 넣어주면 그 n각형을 뽑아
                # n은 실인수 argument
    
    
    
def drawPolygon(n,length):    #함수 재정의
    for _ in range(n):
        t.forward(length)
        t.left(360/n)    
drawPolygon(4,100)   
    

def drawPolygon(n,length=100#default인수): #default parameter   #함수 재정의
    for _ in range(n):
        t.forward(length)
        t.left(360/n)    
drawPolygon(4,100)   

drawPolygon(length = 200, n =4) #순서대로 사용하지않고 지정해서 사용 가능
#근본 문제점
#위와 같이 사용 x
#t는 함수내에서 선언하지 않았기에
#t  = 20 이렇게 정의 해버리면 이제 재사용 불가
#외부의 값을 가져다가 함수내에서 사용하는 것은 지양하라
    
def drawPolygon(t, n, length):    #함수 재정의
    for _ in range(n):
        t.forward(length)
        t.left(360/n)    
drawPolygon(4,100)  

t1 = turtle.Turtle('turtle')
t2 = turtle.Turtle()
drawPolygon(t1,4,100)
drawPolygon(t2,3,100)

s = "hello"
s.upper()

turtle.Turtle.drawPolygon = drawPolygun





























    
    
    
    
    
    
    