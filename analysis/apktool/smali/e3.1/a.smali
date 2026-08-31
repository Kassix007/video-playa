.class public final Le3/a;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public final synthetic r:Le3/g;

.field public final synthetic s:La3/k;

.field public final synthetic t:F

.field public final synthetic u:LP/W;


# direct methods
.method public constructor <init>(Le3/g;La3/k;FLP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le3/a;->r:Le3/g;

    .line 2
    .line 3
    iput-object p2, p0, Le3/a;->s:La3/k;

    .line 4
    .line 5
    iput p3, p0, Le3/a;->t:F

    .line 6
    .line 7
    iput-object p4, p0, Le3/a;->u:LP/W;

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
    new-instance v0, Le3/a;

    .line 2
    .line 3
    iget v3, p0, Le3/a;->t:F

    .line 4
    .line 5
    iget-object v4, p0, Le3/a;->u:LP/W;

    .line 6
    .line 7
    iget-object v1, p0, Le3/a;->r:Le3/g;

    .line 8
    .line 9
    iget-object v2, p0, Le3/a;->s:La3/k;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Le3/a;-><init>(Le3/g;La3/k;FLP/W;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Le3/a;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Le3/a;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Le3/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Le3/a;->q:I

    .line 2
    .line 3
    iget-object v1, p0, Le3/a;->u:LP/W;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    sget-object v3, Lm5/y;->a:Lm5/y;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v4, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-interface {v1, p1}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v5, p0, Le3/a;->r:Le3/g;

    .line 49
    .line 50
    iget-object p1, v5, Le3/g;->A:LP/f0;

    .line 51
    .line 52
    invoke-virtual {p1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    iput v2, p0, Le3/a;->q:I

    .line 63
    .line 64
    invoke-virtual {v5}, Le3/g;->e()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget-object p1, v5, Le3/g;->D:Lv/a0;

    .line 69
    .line 70
    new-instance v4, Le3/d;

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    iget v7, p0, Le3/a;->t:F

    .line 74
    .line 75
    iget-object v8, p0, Le3/a;->s:La3/k;

    .line 76
    .line 77
    sget-object v10, Le3/m;->q:Le3/m;

    .line 78
    .line 79
    invoke-direct/range {v4 .. v11}, Le3/d;-><init>(Le3/g;IFLa3/k;FLe3/m;Lq5/c;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v0, Lv/Y;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {v0, p1, v4, v1}, Lv/Y;-><init>(Lv/a0;LB5/c;Lq5/c;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0, p0}, LM5/y;->g(LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 96
    .line 97
    if-ne p1, v0, :cond_3

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move-object p1, v3

    .line 101
    :goto_1
    if-ne p1, v0, :cond_4

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_4
    return-object v3
.end method
