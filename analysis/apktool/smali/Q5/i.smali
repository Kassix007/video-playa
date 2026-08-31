.class public abstract LQ5/i;
.super LQ5/g;
.source "SourceFile"


# instance fields
.field public final t:LP5/h;


# direct methods
.method public constructor <init>(LP5/h;Lq5/h;ILO5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3, p4}, LQ5/g;-><init>(Lq5/h;ILO5/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ5/i;->t:LP5/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(LO5/t;Lq5/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, LQ5/B;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LQ5/B;-><init>(LO5/t;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, LQ5/i;->g(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 11
    .line 12
    if-ne p1, p2, :cond_0

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 16
    .line 17
    return-object p1
.end method

.method public final collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LQ5/g;->r:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    sget-object v2, Lr5/a;->q:Lr5/a;

    .line 5
    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    invoke-interface {p2}, Lq5/c;->getContext()Lq5/h;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    new-instance v3, LM5/q;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v3, v4, v5}, LM5/q;-><init>(IB)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, LQ5/g;->q:Lq5/h;

    .line 22
    .line 23
    invoke-interface {v4, v1, v3}, Lq5/h;->fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, v4}, Lq5/h;->plus(Lq5/h;)Lq5/h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, v4, v1}, LM5/y;->j(Lq5/h;Lq5/h;Z)Lq5/h;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-static {v1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, LQ5/i;->g(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v2, :cond_5

    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_1
    sget-object v3, Lq5/d;->q:Lq5/d;

    .line 59
    .line 60
    invoke-interface {v1, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v0, v3}, Lq5/h;->get(Lq5/g;)Lq5/f;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v4, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-interface {p2}, Lq5/c;->getContext()Lq5/h;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    instance-of v3, p1, LQ5/B;

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    instance-of v3, p1, LQ5/x;

    .line 83
    .line 84
    if-eqz v3, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance v3, LN/f;

    .line 88
    .line 89
    invoke-direct {v3, p1, v0}, LN/f;-><init>(LP5/i;Lq5/h;)V

    .line 90
    .line 91
    .line 92
    move-object p1, v3

    .line 93
    :cond_3
    :goto_1
    new-instance v0, LQ5/h;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-direct {v0, p0, v3}, LQ5/h;-><init>(LQ5/i;Lq5/c;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, LR5/b;->m(Lq5/h;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, p1, v3, v0, p2}, LQ5/c;->b(Lq5/h;Ljava/lang/Object;Ljava/lang/Object;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v2, :cond_5

    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_4
    invoke-super {p0, p1, p2}, LQ5/g;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-ne p1, v2, :cond_5

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 118
    .line 119
    return-object p1
.end method

.method public abstract g(LP5/i;Lq5/c;)Ljava/lang/Object;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LQ5/i;->t:LP5/h;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, LQ5/g;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
