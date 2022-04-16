import re

regex = []
reg_count = int(input("Number of inputs for regex: "))
for i in range(0,reg_count):
	sol1 = re.compile(input())

	regex.append(sol1)
print(regex)

exmpl = []
exmpl_count = int(input("Number of inputs for example: "))
for i in range(0,exmpl_count):
	sol2 = input()

	exmpl.append(sol2)
print(exmpl)

for i in range(len(exmpl)):
	not_matched = 0
	for j in range(len(regex)):
		if(regex[j].match(exmpl[i])):
			print("YES, {j+1}")
			break
		else:
			not_matched += 1
	if(not_matched == reg_count):
			print("NO, 0")