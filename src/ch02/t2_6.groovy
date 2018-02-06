package ch02

//impl interfaces
def thread=new Thread(
        { print(Thread.currentThread().getName())
        } as Runnable
)
thread.start()
