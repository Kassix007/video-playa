.class public final Lv0/x;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:J

.field public final synthetic s:Lv0/y;


# direct methods
.method public constructor <init>(JLv0/y;Lq5/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lv0/x;->r:J

    .line 2
    .line 3
    iput-object p3, p0, Lv0/x;->s:Lv0/y;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Lv0/x;

    .line 2
    .line 3
    iget-wide v0, p0, Lv0/x;->r:J

    .line 4
    .line 5
    iget-object v2, p0, Lv0/x;->s:Lv0/y;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, v2, p2}, Lv0/x;-><init>(JLv0/y;Lq5/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lv0/x;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lv0/x;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lv0/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lv0/x;->q:I

    .line 2
    .line 3
    const-wide/16 v1, 0x8

    .line 4
    .line 5
    iget-wide v3, p0, Lv0/x;->r:J

    .line 6
    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    sget-object v7, Lr5/a;->q:Lr5/a;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v6, :cond_1

    .line 14
    .line 15
    if-ne v0, v5, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sub-long v8, v3, v1

    .line 37
    .line 38
    iput v6, p0, Lv0/x;->q:I

    .line 39
    .line 40
    invoke-static {v8, v9, p0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v7, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_0
    iput v5, p0, Lv0/x;->q:I

    .line 48
    .line 49
    invoke-static {v1, v2, p0}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-ne p1, v7, :cond_4

    .line 54
    .line 55
    :goto_1
    return-object v7

    .line 56
    :cond_4
    :goto_2
    iget-object p1, p0, Lv0/x;->s:Lv0/y;

    .line 57
    .line 58
    iget-object p1, p1, Lv0/y;->s:LM5/h;

    .line 59
    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    new-instance v0, Lv0/h;

    .line 63
    .line 64
    invoke-direct {v0, v3, v4}, Lv0/h;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1, v0}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 75
    .line 76
    return-object p1
.end method
