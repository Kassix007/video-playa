.class public final LP5/z;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LP5/h;

.field public final synthetic t:LP5/S;

.field public final synthetic u:Ljava/lang/Float;


# direct methods
.method public constructor <init>(LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP5/z;->s:LP5/h;

    .line 2
    .line 3
    iput-object p2, p0, LP5/z;->t:LP5/S;

    .line 4
    .line 5
    iput-object p3, p0, LP5/z;->u:Ljava/lang/Float;

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
    .locals 4

    .line 1
    new-instance v0, LP5/z;

    .line 2
    .line 3
    iget-object v1, p0, LP5/z;->t:LP5/S;

    .line 4
    .line 5
    iget-object v2, p0, LP5/z;->u:Ljava/lang/Float;

    .line 6
    .line 7
    iget-object v3, p0, LP5/z;->s:LP5/h;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LP5/z;-><init>(LP5/h;LP5/S;Ljava/lang/Float;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LP5/z;->r:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP5/J;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LP5/z;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LP5/z;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LP5/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, LP5/z;->q:I

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
    iget-object p1, p0, LP5/z;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LP5/J;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, p0, LP5/z;->t:LP5/S;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    if-eq p1, v1, :cond_5

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-ne p1, v1, :cond_3

    .line 39
    .line 40
    sget-object p1, LP5/H;->a:LE4/f;

    .line 41
    .line 42
    iget-object v1, p0, LP5/z;->u:Ljava/lang/Float;

    .line 43
    .line 44
    if-eq v1, p1, :cond_2

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {v0, p1, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 52
    .line 53
    const-string v0, "MutableStateFlow.resetReplayCache is not supported"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_3
    new-instance p1, LC2/e;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_4
    iput v1, p0, LP5/z;->q:I

    .line 66
    .line 67
    iget-object p1, p0, LP5/z;->s:LP5/h;

    .line 68
    .line 69
    invoke-interface {p1, v0, p0}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 74
    .line 75
    if-ne p1, v0, :cond_5

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_5
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 79
    .line 80
    return-object p1
.end method
