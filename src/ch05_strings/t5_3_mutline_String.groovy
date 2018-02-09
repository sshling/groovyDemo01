package ch05_strings

//多行字符串：three single quotes('''...''')

price=22.3
memo='''ab
cd
ef
gh!
'''
println(memo)

msg="""双引号里创建GString 引用变量：ab
c#${price}#d
ef
gh!
"""
println(msg)
