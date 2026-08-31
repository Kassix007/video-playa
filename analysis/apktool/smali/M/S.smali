.class public final LM/S;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb/m;LB5/a;Ljava/lang/Object;LW0/l;I)V
    .locals 0

    .line 1
    iput p5, p0, LM/S;->q:I

    iput-object p1, p0, LM/S;->s:Ljava/lang/Object;

    iput-object p2, p0, LM/S;->r:Ljava/lang/Object;

    iput-object p3, p0, LM/S;->t:Ljava/lang/Object;

    iput-object p4, p0, LM/S;->u:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, LM/S;->q:I

    iput-object p1, p0, LM/S;->s:Ljava/lang/Object;

    iput-object p2, p0, LM/S;->t:Ljava/lang/Object;

    iput-object p3, p0, LM/S;->u:Ljava/lang/Object;

    iput-object p4, p0, LM/S;->r:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LM/S;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM/S;->u:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, v0

    .line 9
    check-cast v5, Ljava/lang/Number;

    .line 10
    .line 11
    iget-object v0, p0, LM/S;->s:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Ljava/lang/Number;

    .line 15
    .line 16
    iget-object v0, p0, LM/S;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lu/E;

    .line 19
    .line 20
    iget-object v1, v0, Lu/E;->q:Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v1, v0, Lu/E;->r:Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    :cond_0
    iget-object v1, p0, LM/S;->r:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, Lu/D;

    .line 40
    .line 41
    iput-object v4, v0, Lu/E;->q:Ljava/lang/Number;

    .line 42
    .line 43
    iput-object v5, v0, Lu/E;->r:Ljava/lang/Number;

    .line 44
    .line 45
    new-instance v1, Lu/n0;

    .line 46
    .line 47
    iget-object v3, v0, Lu/E;->s:LZ/m;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct/range {v1 .. v6}, Lu/n0;-><init>(Lu/k;LZ/m;Ljava/lang/Object;Ljava/lang/Object;Lu/q;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, v0, Lu/E;->u:Lu/n0;

    .line 54
    .line 55
    iget-object v1, v0, Lu/E;->y:Lu/H;

    .line 56
    .line 57
    iget-object v1, v1, Lu/H;->b:LP/f0;

    .line 58
    .line 59
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v1, v2}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    iput-boolean v1, v0, Lu/E;->v:Z

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    iput-boolean v1, v0, Lu/E;->w:Z

    .line 69
    .line 70
    :cond_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_0
    iget-object v0, p0, LM/S;->s:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La1/j;

    .line 76
    .line 77
    iget-object v1, p0, LM/S;->r:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LB5/a;

    .line 80
    .line 81
    iget-object v2, p0, LM/S;->t:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, La1/i;

    .line 84
    .line 85
    iget-object v3, p0, LM/S;->u:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, LW0/l;

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2, v3}, La1/j;->f(LB5/a;La1/i;LW0/l;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_1
    iget-object v0, p0, LM/S;->s:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, LM/M;

    .line 98
    .line 99
    iget-object v1, p0, LM/S;->r:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, LB5/a;

    .line 102
    .line 103
    iget-object v2, p0, LM/S;->t:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, LM/h0;

    .line 106
    .line 107
    iget-object v3, p0, LM/S;->u:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, LW0/l;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2, v3}, LM/M;->e(LB5/a;LM/h0;LW0/l;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_2
    iget-object v0, p0, LM/S;->t:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, LM5/w;

    .line 120
    .line 121
    iget-object v1, p0, LM/S;->s:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, LM/I0;

    .line 124
    .line 125
    iget-object v2, v1, LM/I0;->c:LN/r;

    .line 126
    .line 127
    iget-object v2, v2, LN/r;->g:LP/f0;

    .line 128
    .line 129
    invoke-virtual {v2}, LP/f0;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, LM/J0;

    .line 134
    .line 135
    sget-object v3, LM/J0;->r:LM/J0;

    .line 136
    .line 137
    const/4 v4, 0x3

    .line 138
    const/4 v5, 0x0

    .line 139
    if-ne v2, v3, :cond_2

    .line 140
    .line 141
    iget-object v2, v1, LM/I0;->c:LN/r;

    .line 142
    .line 143
    invoke-virtual {v2}, LN/r;->d()LN/y;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    sget-object v3, LM/J0;->s:LM/J0;

    .line 148
    .line 149
    iget-object v2, v2, LN/y;->a:Ljava/util/Map;

    .line 150
    .line 151
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-eqz v2, :cond_2

    .line 156
    .line 157
    new-instance v2, LM/N;

    .line 158
    .line 159
    iget-object v3, p0, LM/S;->u:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v3, Lu/c;

    .line 162
    .line 163
    invoke-direct {v2, v3, v5}, LM/N;-><init>(Lu/c;Lq5/c;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v5, v5, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 167
    .line 168
    .line 169
    new-instance v2, LM/O;

    .line 170
    .line 171
    invoke-direct {v2, v1, v5}, LM/O;-><init>(LM/I0;Lq5/c;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v0, v5, v5, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    new-instance v2, LM/P;

    .line 179
    .line 180
    invoke-direct {v2, v1, v5}, LM/P;-><init>(LM/I0;Lq5/c;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v5, v5, v2, v4}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v1, LM/Q;

    .line 188
    .line 189
    iget-object v2, p0, LM/S;->r:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v2, LB5/a;

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    invoke-direct {v1, v2, v3}, LM/Q;-><init>(LB5/a;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, LM5/i0;->G(LB5/c;)LM5/J;

    .line 198
    .line 199
    .line 200
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
