.class public final LA/P;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, LA/P;->q:I

    iput-object p1, p0, LA/P;->s:Ljava/lang/Object;

    iput-object p2, p0, LA/P;->t:Ljava/lang/Object;

    iput-object p3, p0, LA/P;->u:Ljava/lang/Object;

    iput p4, p0, LA/P;->r:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lz0/J;LA/Q;I[I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/P;->q:I

    .line 2
    iput-object p1, p0, LA/P;->s:Ljava/lang/Object;

    iput-object p2, p0, LA/P;->t:Ljava/lang/Object;

    iput p3, p0, LA/P;->r:I

    iput-object p4, p0, LA/P;->u:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LA/P;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA/P;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LP/C;

    .line 9
    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    instance-of v0, p1, La0/u;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LA/P;->t:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, LX/f;

    .line 19
    .line 20
    iget v0, v0, LX/f;->a:I

    .line 21
    .line 22
    iget-object v1, p0, LA/P;->u:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lr/B;

    .line 25
    .line 26
    iget v2, p0, LA/P;->r:I

    .line 27
    .line 28
    sub-int/2addr v0, v2

    .line 29
    invoke-virtual {v1, p1}, Lr/B;->d(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ltz v2, :cond_0

    .line 34
    .line 35
    iget-object v3, v1, Lr/B;->c:[I

    .line 36
    .line 37
    aget v2, v3, v2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const v2, 0x7fffffff

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-virtual {v1, v0, p1}, Lr/B;->g(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "A derived state calculation cannot read itself"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :pswitch_0
    check-cast p1, LK4/d;

    .line 62
    .line 63
    const-string v0, "$this$applyShadow"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, LA/P;->s:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-float v0, v0

    .line 77
    iput v0, p1, LK4/d;->z:F

    .line 78
    .line 79
    invoke-virtual {p1}, LK4/d;->j()V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, LA/P;->t:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-float v0, v0

    .line 91
    iput v0, p1, LK4/d;->A:F

    .line 92
    .line 93
    invoke-virtual {p1}, LK4/d;->j()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, LA/P;->u:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    int-to-float v0, v0

    .line 105
    iput v0, p1, LK4/d;->B:F

    .line 106
    .line 107
    invoke-virtual {p1}, LK4/d;->j()V

    .line 108
    .line 109
    .line 110
    iget v0, p0, LA/P;->r:I

    .line 111
    .line 112
    iput v0, p1, LK4/d;->C:I

    .line 113
    .line 114
    invoke-virtual {p1}, LK4/d;->j()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, LK4/d;->a()V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_1
    check-cast p1, Lz0/I;

    .line 124
    .line 125
    iget-object v0, p0, LA/P;->s:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, [Lz0/J;

    .line 128
    .line 129
    iget-object v1, p0, LA/P;->t:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, LA/Q;

    .line 132
    .line 133
    iget-object v2, p0, LA/P;->u:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, [I

    .line 136
    .line 137
    array-length v3, v0

    .line 138
    const/4 v4, 0x0

    .line 139
    move v5, v4

    .line 140
    move v6, v5

    .line 141
    :goto_1
    if-ge v5, v3, :cond_6

    .line 142
    .line 143
    aget-object v7, v0, v5

    .line 144
    .line 145
    add-int/lit8 v8, v6, 0x1

    .line 146
    .line 147
    invoke-static {v7}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7}, Lz0/J;->g()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    instance-of v10, v9, LA/N;

    .line 155
    .line 156
    const/4 v11, 0x0

    .line 157
    if-eqz v10, :cond_3

    .line 158
    .line 159
    check-cast v9, LA/N;

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    move-object v9, v11

    .line 163
    :goto_2
    if-eqz v9, :cond_4

    .line 164
    .line 165
    iget-object v11, v9, LA/N;->c:LA/w;

    .line 166
    .line 167
    :cond_4
    iget v9, p0, LA/P;->r:I

    .line 168
    .line 169
    if-eqz v11, :cond_5

    .line 170
    .line 171
    iget v10, v7, Lz0/J;->r:I

    .line 172
    .line 173
    sub-int/2addr v9, v10

    .line 174
    sget-object v10, LW0/l;->q:LW0/l;

    .line 175
    .line 176
    invoke-virtual {v11, v9, v10}, LA/w;->a(ILW0/l;)I

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    goto :goto_3

    .line 181
    :cond_5
    iget-object v10, v1, LA/Q;->b:Lc0/d;

    .line 182
    .line 183
    iget v11, v7, Lz0/J;->r:I

    .line 184
    .line 185
    sub-int/2addr v9, v11

    .line 186
    invoke-virtual {v10, v4, v9}, Lc0/d;->a(II)I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    :goto_3
    aget v6, v2, v6

    .line 191
    .line 192
    invoke-static {p1, v7, v6, v9}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 193
    .line 194
    .line 195
    add-int/lit8 v5, v5, 0x1

    .line 196
    .line 197
    move v6, v8

    .line 198
    goto :goto_1

    .line 199
    :cond_6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 200
    .line 201
    return-object p1

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
