.class public final synthetic LU4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LM5/w;

.field public final synthetic s:Lj5/b;

.field public final synthetic t:LP/W;

.field public final synthetic u:LP/S0;

.field public final synthetic v:LP/S0;

.field public final synthetic w:LM/I0;


# direct methods
.method public synthetic constructor <init>(LR4/k1;LM5/w;Lj5/b;LP/W;LP/S0;LP/S0;LM/I0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/w;->q:LR4/k1;

    iput-object p2, p0, LU4/w;->r:LM5/w;

    iput-object p3, p0, LU4/w;->s:Lj5/b;

    iput-object p4, p0, LU4/w;->t:LP/W;

    iput-object p5, p0, LU4/w;->u:LP/S0;

    iput-object p6, p0, LU4/w;->v:LP/S0;

    iput-object p7, p0, LU4/w;->w:LM/I0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LU4/w;->t:LP/W;

    .line 3
    .line 4
    invoke-static {v1, v0}, LU4/a;->j(LP/W;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LU4/w;->u:LP/S0;

    .line 8
    .line 9
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, LU4/w;->q:LR4/k1;

    .line 20
    .line 21
    iget-object v4, p0, LU4/w;->v:LP/S0;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    iget-object v0, v3, LR4/k1;->S:Lg5/h;

    .line 38
    .line 39
    iget-object v0, v0, Lg5/h;->k:Le/g;

    .line 40
    .line 41
    const-string v2, "video/*"

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Le/g;->u(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-interface {v4}, LP/S0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    iget-object v0, v3, LR4/k1;->S:Lg5/h;

    .line 72
    .line 73
    iget-object v0, v0, Lg5/h;->k:Le/g;

    .line 74
    .line 75
    const-string v2, "image/*"

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Le/g;->u(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iget-object v0, v3, LR4/k1;->S:Lg5/h;

    .line 82
    .line 83
    iget-object v0, v0, Lg5/h;->j:Le/g;

    .line 84
    .line 85
    const-string v2, "*/*"

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Le/g;->u(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    new-instance v0, LU4/C;

    .line 91
    .line 92
    iget-object v2, p0, LU4/w;->w:LM/I0;

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-direct {v0, v2, v3, v1, v4}, LU4/C;-><init>(LM/I0;LR4/k1;LP/W;Lq5/c;)V

    .line 96
    .line 97
    .line 98
    const/4 v1, 0x3

    .line 99
    iget-object v2, p0, LU4/w;->r:LM5/w;

    .line 100
    .line 101
    invoke-static {v2, v4, v4, v0, v1}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, LU4/w;->s:Lj5/b;

    .line 105
    .line 106
    invoke-virtual {v0}, Lj5/b;->d()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lj5/b;->g()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lj5/b;->f()V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 116
    .line 117
    return-object v0
.end method
