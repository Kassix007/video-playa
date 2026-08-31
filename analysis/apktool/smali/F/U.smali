.class public final LF/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/I;


# instance fields
.field public final a:Lx/h;

.field public final b:LF/e;


# direct methods
.method public constructor <init>(Lx/h;LF/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF/U;->a:Lx/h;

    .line 5
    .line 6
    iput-object p2, p0, LF/U;->b:LF/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lw/C0;FLq5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, LF/T;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LF/T;

    .line 7
    .line 8
    iget v1, v0, LF/T;->t:I

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
    iput v1, v0, LF/T;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LF/T;

    .line 21
    .line 22
    check-cast p3, Ls5/c;

    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, LF/T;-><init>(LF/U;Ls5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v0, LF/T;->r:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, v0, LF/T;->t:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, LF/T;->q:LF/U;

    .line 37
    .line 38
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p3, LB0/a;

    .line 54
    .line 55
    invoke-direct {p3, p0, p1}, LB0/a;-><init>(LF/U;Lw/i0;)V

    .line 56
    .line 57
    .line 58
    iput-object p0, v0, LF/T;->q:LF/U;

    .line 59
    .line 60
    iput v2, v0, LF/T;->t:I

    .line 61
    .line 62
    iget-object v1, p0, LF/U;->a:Lx/h;

    .line 63
    .line 64
    invoke-virtual {v1, p1, p2, p3, v0}, Lx/h;->d(Lw/i0;FLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 69
    .line 70
    if-ne p3, p1, :cond_3

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_3
    move-object p1, p0

    .line 74
    :goto_1
    check-cast p3, Ljava/lang/Number;

    .line 75
    .line 76
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    iget-object p1, p1, LF/U;->b:LF/e;

    .line 81
    .line 82
    iget-object p3, p1, LF/N;->d:LF/D;

    .line 83
    .line 84
    iget-object v0, p1, LF/N;->d:LF/D;

    .line 85
    .line 86
    iget-object v0, v0, LF/D;->t:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LP/b0;

    .line 89
    .line 90
    invoke-virtual {v0}, LP/b0;->e()F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/4 v1, 0x0

    .line 95
    cmpg-float v0, v0, v1

    .line 96
    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    iget-object v0, p3, LF/D;->t:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, LP/b0;

    .line 103
    .line 104
    invoke-virtual {v0}, LP/b0;->e()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    float-to-double v2, v0

    .line 113
    const-wide v4, 0x3f50624dd2f1a9fcL    # 0.001

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    cmpg-double v0, v2, v4

    .line 119
    .line 120
    if-gez v0, :cond_6

    .line 121
    .line 122
    invoke-virtual {p1}, LF/N;->j()I

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    iget-object v0, p1, LF/N;->k:Lp3/z0;

    .line 127
    .line 128
    invoke-virtual {v0}, Lp3/z0;->b()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    iget-object v0, p1, LF/N;->p:LP/f0;

    .line 135
    .line 136
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, LF/B;

    .line 141
    .line 142
    iget-object v0, v0, LF/B;->r:LM5/w;

    .line 143
    .line 144
    new-instance v2, LF/J;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-direct {v2, p1, v3}, LF/J;-><init>(LF/e;Lq5/c;)V

    .line 148
    .line 149
    .line 150
    const/4 v4, 0x3

    .line 151
    invoke-static {v0, v3, v3, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 152
    .line 153
    .line 154
    :cond_5
    const/4 v0, 0x0

    .line 155
    invoke-virtual {p1, p3, v1, v0}, LF/N;->s(IFZ)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_6
    :goto_2
    iget-object p1, p3, LF/D;->t:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, LP/b0;

    .line 162
    .line 163
    invoke-virtual {p1}, LP/b0;->e()F

    .line 164
    .line 165
    .line 166
    :goto_3
    new-instance p1, Ljava/lang/Float;

    .line 167
    .line 168
    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    .line 169
    .line 170
    .line 171
    return-object p1
.end method
