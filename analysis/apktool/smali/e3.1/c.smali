.class public final Le3/c;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Le3/m;

.field public final synthetic s:LM5/b0;

.field public final synthetic t:I

.field public final synthetic u:Le3/g;


# direct methods
.method public constructor <init>(Le3/m;LM5/b0;ILe3/g;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/c;->r:Le3/m;

    .line 2
    .line 3
    iput-object p2, p0, Le3/c;->s:LM5/b0;

    .line 4
    .line 5
    iput p3, p0, Le3/c;->t:I

    .line 6
    .line 7
    iput-object p4, p0, Le3/c;->u:Le3/g;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Le3/c;

    .line 2
    .line 3
    iget v3, p0, Le3/c;->t:I

    .line 4
    .line 5
    iget-object v4, p0, Le3/c;->u:Le3/g;

    .line 6
    .line 7
    iget-object v1, p0, Le3/c;->r:Le3/m;

    .line 8
    .line 9
    iget-object v2, p0, Le3/c;->s:LM5/b0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Le3/c;-><init>(Le3/m;LM5/b0;ILe3/g;Lq5/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Le3/c;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Le3/c;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Le3/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Le3/c;->q:I

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
    goto :goto_2

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
    sget-object p1, Le3/b;->a:[I

    .line 24
    .line 25
    iget-object v0, p0, Le3/c;->r:Le3/m;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    aget p1, p1, v0

    .line 32
    .line 33
    const v0, 0x7fffffff

    .line 34
    .line 35
    .line 36
    if-ne p1, v1, :cond_3

    .line 37
    .line 38
    iget-object p1, p0, Le3/c;->s:LM5/b0;

    .line 39
    .line 40
    invoke-interface {p1}, LM5/b0;->b()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    :cond_3
    move p1, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget p1, p0, Le3/c;->t:I

    .line 49
    .line 50
    :goto_0
    iput v1, p0, Le3/c;->q:I

    .line 51
    .line 52
    iget-object v2, p0, Le3/c;->u:Le3/g;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    if-ne p1, v0, :cond_5

    .line 58
    .line 59
    new-instance v0, Le3/e;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v0, v2, p1, v3}, Le3/e;-><init>(Le3/g;II)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, p0}, Lu/d;->r(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    new-instance v0, Le3/e;

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    invoke-direct {v0, v2, p1, v3}, Le3/e;-><init>(Le3/g;II)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p0}, Lq5/c;->getContext()Lq5/h;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, LP/b;->o(Lq5/h;)LP/T;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p1, v0, p0}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_1
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 89
    .line 90
    if-ne p1, v0, :cond_6

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_2

    .line 100
    .line 101
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 102
    .line 103
    return-object p1
.end method
