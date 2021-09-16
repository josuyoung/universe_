def add(a,b):
    return a+b
add(1.2,3.4)

add("hug","and kiss")
print(add([1,2,3],[4,5,6]))

#연결하기 concatenation

# 동적 자료형 dynamic typing
s = "hug"
print(s + " and kiss")
print(s.__add__(' and kiss'))   #a + b == a.__add__(b)

p = 40
a = 10
print(p + a)
L = [1,2,3]
print(L.__add__([4,5,6]))
#함수의 리턴 값
a = add(1,2)

add(1,2)+3 # ok
def addSub(a,b):
    return a+b, a-b  #return값 여러개 가능
                     #값은 튜플 형태로 반환 되고 변수 하나에 튜플을 넣어도 되고
                     #아래와 같이 x,y변수 2개에 값을 넣을수도 있다`!
print(addSub(4,6))
r = addSub(5,6)
print(type(r))
r[0]

x,y = addSub(5,6) # x = 11 y = -1

def printMessage():
    print("hello")
    
    
printMessage() # none객체를 가져옴 값이 없는 0 과 같은 존재 retun 0;랄까?맞아?