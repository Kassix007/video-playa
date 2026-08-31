.class public final Le5/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:LP/c0;

.field public final synthetic s:LP/W;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LP/c0;LP/W;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/g;->r:LP/c0;

    .line 2
    .line 3
    iput-object p2, p0, Le5/g;->s:LP/W;

    .line 4
    .line 5
    iput-object p3, p0, Le5/g;->t:LP/W;

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
    new-instance p1, Le5/g;

    .line 2
    .line 3
    iget-object v0, p0, Le5/g;->s:LP/W;

    .line 4
    .line 5
    iget-object v1, p0, Le5/g;->t:LP/W;

    .line 6
    .line 7
    iget-object v2, p0, Le5/g;->r:LP/c0;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Le5/g;-><init>(LP/c0;LP/W;LP/W;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Le5/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Le5/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Le5/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Le5/g;->q:I

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
    goto :goto_1

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
    :cond_2
    :goto_0
    iput v1, p0, Le5/g;->q:I

    .line 24
    .line 25
    const-wide/16 v2, 0x3e8

    .line 26
    .line 27
    invoke-static {v2, v3, p0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 32
    .line 33
    if-ne p1, v0, :cond_3

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_3
    :goto_1
    iget-object p1, p0, Le5/g;->r:LP/c0;

    .line 37
    .line 38
    invoke-virtual {p1}, LP/c0;->e()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Le5/g;->s:LP/W;

    .line 43
    .line 44
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Le5/a;

    .line 49
    .line 50
    invoke-virtual {v3}, Le5/a;->a()Landroid/database/Cursor;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eq v0, v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Le5/a;

    .line 65
    .line 66
    invoke-virtual {v0}, Le5/a;->a()Landroid/database/Cursor;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v3, p0, Le5/g;->t:LP/W;

    .line 71
    .line 72
    invoke-interface {v3, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Le5/a;

    .line 80
    .line 81
    invoke-virtual {v0}, Le5/a;->a()Landroid/database/Cursor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    invoke-virtual {p1, v0}, LP/c0;->f(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_0
.end method
