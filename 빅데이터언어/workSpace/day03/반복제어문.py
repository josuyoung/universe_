'''
for i in range(40,51):
    print("갤럭시노트",i,"출시!")
for i in range(100):
    if(i%2 ==0):
        print(i , end = "") 
'''

# =============================================================================
# result = []
# for i in range(10):
#     result += list(range(6))
#         
# print(result)
# 
# 
# num1 = int(input("첫번째 정수"))
# 
# num2 = int(input("두번 째 정수"));
# 
# 
# res = ""
# tot = 0;
# for i in range(num1,num2+1):
#     res += str(i)
#     tot += i
#     if(i < num2):
#         res += "+"
# print(res)
# print(tot)
# 
# 
# =============================================================================
# num1 = int(input("몇팩토리억?"))
# fact = 1
# for i in range(1,num1+1):
#     fact *= i
# print(fact)


for i in range(2,10):
    for j in range(1,10):
        print("{}x{} = {:2d}\t".format(i,j,i*j),end = "")
    print()



























