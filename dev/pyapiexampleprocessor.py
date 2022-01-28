
template = ''' 
'''


f2 = open("../data/output/apitestpytemplate.py", "a")
f1 = open("../data/input/test_schematics_v1_examples.py", "r")
flag=0
for l in f1.readlines():
    if l.startswith("class"):
        s=l.replace("class ","")
        s=s.split("(")[0]
        template+= "N = "+s+"()\n"
   
    if " def " in l:
    
        s = l.split("(")[0]
        s = s.replace("def", "")
        template+="N."+s.lstrip()+"()\n"

f2.write(template)
f2.close()