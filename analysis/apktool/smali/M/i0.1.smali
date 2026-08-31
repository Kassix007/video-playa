.class public final LM/i0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP/W;


# direct methods
.method public synthetic constructor <init>(LP/W;I)V
    .locals 0

    .line 1
    iput p2, p0, LM/i0;->q:I

    iput-object p1, p0, LM/i0;->r:LP/W;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LM/i0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v3

    .line 24
    :goto_0
    and-int/2addr p2, v2

    .line 25
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 32
    .line 33
    sget-object v0, La1/b;->q:La1/b;

    .line 34
    .line 35
    invoke-static {p2, v3, v0}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object v0, p0, LM/i0;->r:LP/W;

    .line 40
    .line 41
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LB5/e;

    .line 46
    .line 47
    invoke-static {p2, v0, p1, v3}, Ln5/A;->h(Lc0/m;LB5/e;LP/o;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p1}, LP/o;->N()V

    .line 52
    .line 53
    .line 54
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_0
    check-cast p1, LP/o;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    and-int/lit8 p2, p2, 0x3

    .line 66
    .line 67
    const/4 v0, 0x2

    .line 68
    if-ne p2, v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, LP/o;->x()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_2

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {p1}, LP/o;->N()V

    .line 78
    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_3
    :goto_2
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 82
    .line 83
    sget-object v0, LM/d;->t:LM/d;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    invoke-static {p2, v1, v0}, LI0/j;->a(Lc0/m;ZLB5/c;)Lc0/m;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    sget-object v0, Lc0/b;->q:Lc0/e;

    .line 91
    .line 92
    invoke-static {v0, v1}, LA/n;->d(Lc0/e;Z)Lz0/C;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget v2, p1, LP/o;->P:I

    .line 97
    .line 98
    invoke-virtual {p1}, LP/o;->m()LP/i0;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {p1, p2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    sget-object v4, LB0/k;->a:LB0/j;

    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v4, LB0/j;->b:LB0/D;

    .line 112
    .line 113
    invoke-virtual {p1}, LP/o;->W()V

    .line 114
    .line 115
    .line 116
    iget-boolean v5, p1, LP/o;->O:Z

    .line 117
    .line 118
    if-eqz v5, :cond_4

    .line 119
    .line 120
    invoke-virtual {p1, v4}, LP/o;->l(LB5/a;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    invoke-virtual {p1}, LP/o;->g0()V

    .line 125
    .line 126
    .line 127
    :goto_3
    sget-object v4, LB0/j;->e:LB0/i;

    .line 128
    .line 129
    invoke-static {v4, p1, v0}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, LB0/j;->d:LB0/i;

    .line 133
    .line 134
    invoke-static {v0, p1, v3}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, LB0/j;->f:LB0/i;

    .line 138
    .line 139
    iget-boolean v3, p1, LP/o;->O:Z

    .line 140
    .line 141
    if-nez v3, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_6

    .line 156
    .line 157
    :cond_5
    invoke-static {v2, p1, v2, v0}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 158
    .line 159
    .line 160
    :cond_6
    sget-object v0, LB0/j;->c:LB0/i;

    .line 161
    .line 162
    invoke-static {v0, p1, p2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, LM/i0;->r:LP/W;

    .line 166
    .line 167
    invoke-interface {p2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    check-cast p2, LB5/e;

    .line 172
    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-interface {p2, p1, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    const/4 p2, 0x1

    .line 181
    invoke-virtual {p1, p2}, LP/o;->p(Z)V

    .line 182
    .line 183
    .line 184
    :goto_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 185
    .line 186
    return-object p1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
