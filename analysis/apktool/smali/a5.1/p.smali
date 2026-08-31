.class public final synthetic La5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:I

.field public final synthetic s:F

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lcom/web2native/MainActivity;

.field public final synthetic w:LB5/c;

.field public final synthetic x:LB5/a;

.field public final synthetic y:LP/W;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IFLjava/lang/String;Ljava/lang/String;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/p;->q:Ljava/util/List;

    iput p2, p0, La5/p;->r:I

    iput p3, p0, La5/p;->s:F

    iput-object p4, p0, La5/p;->t:Ljava/lang/String;

    iput-object p5, p0, La5/p;->u:Ljava/lang/String;

    iput-object p6, p0, La5/p;->v:Lcom/web2native/MainActivity;

    iput-object p7, p0, La5/p;->w:LB5/c;

    iput-object p8, p0, La5/p;->x:LB5/a;

    iput-object p9, p0, La5/p;->y:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, LA/u;

    .line 2
    .line 3
    move-object v10, p2

    .line 4
    check-cast v10, LP/o;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const-string p3, "$this$ModalBottomSheet"

    .line 13
    .line 14
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    and-int/lit8 p1, p2, 0x11

    .line 18
    .line 19
    const/16 p3, 0x10

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    move p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    and-int/2addr p2, v0

    .line 28
    invoke-virtual {v10, p2, p1}, LP/o;->K(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_a

    .line 33
    .line 34
    new-instance v0, LD/a;

    .line 35
    .line 36
    iget-object v2, p0, La5/p;->q:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget p2, p0, La5/p;->r:I

    .line 43
    .line 44
    const/4 p3, 0x2

    .line 45
    const/4 v1, 0x3

    .line 46
    if-ne p2, p3, :cond_1

    .line 47
    .line 48
    const/4 p2, 0x4

    .line 49
    move v3, v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v3, p3

    .line 52
    move p2, v1

    .line 53
    :goto_1
    rem-int v4, p1, p2

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    rem-int v5, p1, v3

    .line 59
    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    if-ne v5, v4, :cond_4

    .line 63
    .line 64
    :cond_3
    mul-int/lit8 v6, v3, 0x6

    .line 65
    .line 66
    if-gt p1, v6, :cond_4

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    if-le v4, v5, :cond_5

    .line 70
    .line 71
    :goto_2
    move v1, p2

    .line 72
    goto :goto_4

    .line 73
    :cond_5
    if-gt v4, v5, :cond_6

    .line 74
    .line 75
    :goto_3
    move v1, v3

    .line 76
    :cond_6
    :goto_4
    invoke-direct {v0, v1}, LD/a;-><init>(I)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LP/z;

    .line 80
    .line 81
    invoke-virtual {v10, p1}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Landroid/content/res/Configuration;

    .line 86
    .line 87
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 88
    .line 89
    sget-object p2, Lc0/j;->q:Lc0/j;

    .line 90
    .line 91
    iget v1, p0, La5/p;->s:F

    .line 92
    .line 93
    const/16 v3, 0xfa

    .line 94
    .line 95
    if-ne p1, p3, :cond_7

    .line 96
    .line 97
    int-to-float p1, v3

    .line 98
    invoke-static {p2, p1, v1}, Landroidx/compose/foundation/layout/c;->b(Lc0/m;FF)Lc0/m;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    goto :goto_5

    .line 103
    :cond_7
    invoke-static {p2}, LE3/h;->J(Lc0/m;)Lc0/m;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    int-to-float p2, v3

    .line 108
    invoke-static {p1, p2, v1}, Landroidx/compose/foundation/layout/c;->b(Lc0/m;FF)Lc0/m;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_5
    invoke-virtual {v10, v2}, LP/o;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    iget-object v3, p0, La5/p;->t:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v10, v3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    or-int/2addr p2, p3

    .line 123
    iget-object v4, p0, La5/p;->u:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v10, v4}, LP/o;->g(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p3

    .line 129
    or-int/2addr p2, p3

    .line 130
    iget-object v5, p0, La5/p;->v:Lcom/web2native/MainActivity;

    .line 131
    .line 132
    invoke-virtual {v10, v5}, LP/o;->i(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    or-int/2addr p2, p3

    .line 137
    iget-object v6, p0, La5/p;->w:LB5/c;

    .line 138
    .line 139
    invoke-virtual {v10, v6}, LP/o;->g(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p3

    .line 143
    or-int/2addr p2, p3

    .line 144
    iget-object v7, p0, La5/p;->x:LB5/a;

    .line 145
    .line 146
    invoke-virtual {v10, v7}, LP/o;->g(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    or-int/2addr p2, p3

    .line 151
    invoke-virtual {v10}, LP/o;->H()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    if-nez p2, :cond_8

    .line 156
    .line 157
    sget-object p2, LP/k;->a:LP/S;

    .line 158
    .line 159
    if-ne p3, p2, :cond_9

    .line 160
    .line 161
    :cond_8
    new-instance v1, LU1/u;

    .line 162
    .line 163
    iget-object v8, p0, La5/p;->y:LP/W;

    .line 164
    .line 165
    invoke-direct/range {v1 .. v8}, LU1/u;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/W;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v10, v1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object p3, v1

    .line 172
    :cond_9
    move-object v9, p3

    .line 173
    check-cast v9, LB5/c;

    .line 174
    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v2, 0x0

    .line 177
    const/4 v3, 0x0

    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v5, 0x0

    .line 180
    const/4 v6, 0x0

    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    move-object v1, p1

    .line 184
    invoke-static/range {v0 .. v11}, LD5/a;->d(LD/a;Lc0/m;LD/y;LA/L;LA/g;LA/e;Lw/I;ZLv/l;LB5/c;LP/o;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    invoke-virtual {v10}, LP/o;->N()V

    .line 189
    .line 190
    .line 191
    :goto_6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 192
    .line 193
    return-object p1
.end method
