'''
a = "삼성전자"
a[3]

a  = "good morning";
"파이썬" in a

#len함수는 글자수 알려줌 인덱스형식으로 말고
#range(len()) 이렇게 묶으면 이제 n-1까지 이니 인덱스형식 가능
print(len(a))

a = "빅데이터 언어"
print(a[::]) 

print("구글", "아마존","광운대",sep=";")
'''
'''
a = input("당신의 빅데이터 언어 점수를 적어주세요:");
b = input("당신의 키는 얼마일까요?");

b = int(b)
print(b+b);

'''
'''
a = input("이름을 입력하세요:");
b = int(input("학번을 입력하세요:"))
c = input("주민번호 13자리를 입력해주세요")
c = c[:6]
print("제 이름은 %s입니다 소속은 광운대학교 정보융합학부 소속이며, 학번은 %d입니다. 주민등록번호는 %s-*******입니다"%(a,b,c))
print(c)
'''
'''
a = "apple, banana, orenge"
b = str(a.split(','))
b = b.strip()   #공백 없애기
b = b.split()
print(len(b))
'''
a ="hello, world";
b = a.replace("hello","korea");
print(b)


'''
a = ("my name is {name} and my hobby is {hobby} would you like {0}?"
         .format('soccer',hobby = 'weight training', name = 'suyoung'))
'''
a = ("my name is {} and my hobby is {} would you like {}?"
         .format('weight training', 'soccer','suyoung'))

print(a)


fir_name = input("성을 입력하세요");
name = input("이름을 입력하하세요 ex.suyoung")

fir_name = fir_name.upper()

print("제 이름은 %s이고 성은 %s입니다"%(name,fir_name))





















