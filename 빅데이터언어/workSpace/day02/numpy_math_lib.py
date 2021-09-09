

import numpy as np   # 수관련된 라이브러리
import matplotlib.pyplot as plt  # 그림 그려주는 라이브러리
import math
x = np.linspace(-5,5,20);    
y = 2*x+30

plt.plot(x,y);  
            
a = 123.99997   #a만 쓰면 정수값 출력 , n 쓰면 그 자릿수만큼 출력 반올림은 덤
print(round(a,4))

a = list(range(0,101))

b = max(a)
c = min(a)

print(b , c)

d = 3/7
e = 3/8
f = 3/8
a5 = 3.14195
print("d의 소수값은 %.0f이며 e의 소수값은 %.2fkg 이고? f의 소수값은 %.2f이다"%(a5,e,f));

e = round(d,3)
print(e)

abs(-12)
math.fabs(-5)
math.ceil(6.1)
math.floor(6.2)
math.factorial(3)
