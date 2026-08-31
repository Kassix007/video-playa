.class public final synthetic LM5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LM5/g;->q:I

    iput-object p2, p0, LM5/g;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LU5/c;LU5/b;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, LM5/g;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM5/g;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LM5/g;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM5/g;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LU5/h;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p2, Lm5/y;

    .line 13
    .line 14
    check-cast p3, Lq5/h;

    .line 15
    .line 16
    invoke-virtual {v0}, LU5/h;->c()V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    iget-object v0, p0, LM5/g;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LU5/c;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/Throwable;

    .line 27
    .line 28
    check-cast p2, Lm5/y;

    .line 29
    .line 30
    check-cast p3, Lq5/h;

    .line 31
    .line 32
    sget-object p1, LU5/c;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p2}, LU5/c;->g(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    iget-object p2, p0, LM5/g;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, LJ5/i;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Throwable;

    .line 47
    .line 48
    check-cast p3, Lq5/h;

    .line 49
    .line 50
    invoke-virtual {p2, p1}, LJ5/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
