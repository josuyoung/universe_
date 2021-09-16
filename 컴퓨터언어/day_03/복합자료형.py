#복합자료형 complex data type
a = [1,2,3,"hello"]
L = [1,2,3,4,5]
type(L)
L[0]
L[:2]
L+L
L*2
len(L)
2 in L
5 in L
10 in L #L에 이 값이 있으면 true
L[0] = 10 # 수정
del L[0]
del L[2:]
L = [1,2,3]
L.append(100)
L.append(100)

L.insert(3,4)
L.count(100)
L.reverse()
L.sort()
L.remove(1) #값을 모두 지우지 않고 하나만 지움
L.extend([100,200,300]) # ==append(100) 200 300~
L.append([100,200,300])
del L[-1] # append로 추가한 모두가 날아감
            # 하나씩추가는 expend 한번에는 append
L.pop()
L.pop(0)

#tuple
(1,2,3)
t = (1,2,3)
type(t)

#t[0] = 100  immutable x
#숫자, 문자열, 튜플
s = "hello"
#s[0] = 'H'
t = 1,2,3 #괄호는 없어도 되지만 콤마가 정말 중요함

#튜플 한개 선언시
t = (1,) #이리 해야함


[('one',1),('two',2),('three',3)] #튜플과 메소드 조함
t = (1,2,3)
t.count(3)

t.index(3)
x,y,z = 1,2,3 #짝지어 선택 가능

x,*xs = 1,2,3,4,5   #확장선언 가능,나머지를 묶겟다!
print(xs)
x,*xs,y = 1,2,3,4,5


# 사전 dictionary
# mapping 자료형
# 사상
member = {"baseball":5,"soccer":11,"basketball":9}
#key : value
member["soccer"] # value뽑아주기
len(member)
del member['basketball']
member['soccer'] = 100
print(member.values())
member.keys()
member.values()
member.items()
list(member.keys())
list(member.values())
list(member.items())

member.get('soccer')
member["soccer"]    #같은말

member.get("soccer")
member.get("socce",0) #default값은 none
                        #,뒤에 값을 디폴트로 설정 가능
print(member.get("soccer",'?')) #default를 ?로 주기 잘모르면

member.update({"swimming":19,"fight":2})
#있으면 바뀌고 없으면 추가
print(member)
member.clear() # 삭제
dict(a =1,b=2)#앞에 인수가 문자형이면 가능한 방법//정수는 에러

set()
{1,2,3} #키와 벨류가 있는게 아니라 나열돼있으면 set
        #중복 데이터 설정 안됌
print(set('abc'))

a = {1,2,3,4,5}
b = {4,5,6,7,8}
#print(a.union(b)) # 합집합 1,2,3,4,5,6,7,8
a.intersection(b) # 교집합 4,5 메소드는 객체뒤에 .찍고 탭으로 참조가능
a.difference(b)   # 차집합
a.add(10)
a.discard(10)
a.pop()
a.pop()

print(a)










