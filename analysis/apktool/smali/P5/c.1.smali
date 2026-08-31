.class public final LP5/c;
.super LQ5/g;
.source "SourceFile"


# instance fields
.field public final t:Ls5/i;

.field public final u:Ls5/i;


# direct methods
.method public constructor <init>(LB5/e;Lq5/h;ILO5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, LQ5/g;-><init>(Lq5/h;ILO5/a;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Ls5/i;

    .line 5
    .line 6
    iput-object p1, p0, LP5/c;->t:Ls5/i;

    .line 7
    .line 8
    iput-object p1, p0, LP5/c;->u:Ls5/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(LO5/t;Lq5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LP5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP5/b;

    .line 7
    .line 8
    iget v1, v0, LP5/b;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LP5/b;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP5/b;

    .line 21
    .line 22
    check-cast p2, Ls5/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, LP5/b;-><init>(LP5/c;Ls5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v0, LP5/b;->r:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, LP5/b;->t:I

    .line 30
    .line 31
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-ne v1, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, LP5/b;->q:LO5/t;

    .line 39
    .line 40
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, LP5/b;->q:LO5/t;

    .line 56
    .line 57
    iput v3, v0, LP5/b;->t:I

    .line 58
    .line 59
    iget-object p2, p0, LP5/c;->t:Ls5/i;

    .line 60
    .line 61
    invoke-interface {p2, p1, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 66
    .line 67
    if-ne p2, v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object p2, v2

    .line 71
    :goto_1
    if-ne p2, v0, :cond_4

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    :goto_2
    check-cast p1, LO5/s;

    .line 75
    .line 76
    iget-object p1, p1, LO5/s;->t:LO5/e;

    .line 77
    .line 78
    invoke-virtual {p1}, LO5/e;->x()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    .line 88
    .line 89
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public final d(Lq5/h;ILO5/a;)LQ5/g;
    .locals 2

    .line 1
    new-instance v0, LP5/c;

    .line 2
    .line 3
    iget-object v1, p0, LP5/c;->u:Ls5/i;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, LP5/c;-><init>(LB5/e;Lq5/h;ILO5/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "block["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LP5/c;->t:Ls5/i;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "] -> "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, LQ5/g;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method
