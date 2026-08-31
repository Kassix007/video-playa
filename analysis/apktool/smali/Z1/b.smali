.class public final LZ1/b;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LZ1/d;

.field public final synthetic s:Landroid/net/Uri;

.field public final synthetic t:Landroid/view/InputEvent;


# direct methods
.method public constructor <init>(LZ1/d;Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ1/b;->r:LZ1/d;

    .line 2
    .line 3
    iput-object p2, p0, LZ1/b;->s:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, LZ1/b;->t:Landroid/view/InputEvent;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, LZ1/b;

    .line 2
    .line 3
    iget-object v0, p0, LZ1/b;->s:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v1, p0, LZ1/b;->t:Landroid/view/InputEvent;

    .line 6
    .line 7
    iget-object v2, p0, LZ1/b;->r:LZ1/d;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, LZ1/b;-><init>(LZ1/d;Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LZ1/b;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LZ1/b;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LZ1/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LZ1/b;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LZ1/b;->r:LZ1/d;

    .line 24
    .line 25
    iget-object p1, p1, LZ1/d;->a:La2/e;

    .line 26
    .line 27
    iput v1, p0, LZ1/b;->q:I

    .line 28
    .line 29
    iget-object v0, p0, LZ1/b;->s:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v1, p0, LZ1/b;->t:Landroid/view/InputEvent;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1, p0}, La2/e;->f(Landroid/net/Uri;Landroid/view/InputEvent;Lq5/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 38
    .line 39
    if-ne p1, v0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 43
    .line 44
    return-object p1
.end method
