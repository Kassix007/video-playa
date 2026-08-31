.class public final synthetic LC0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/j;->q:I

    iput-object p2, p0, LC0/j;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 10

    .line 1
    iget v0, p0, LC0/j;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC0/j;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LW1/l;

    .line 9
    .line 10
    iget-object v1, v0, LW1/l;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LR4/k1;

    .line 13
    .line 14
    iget-object v2, v0, LW1/l;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LP5/S;

    .line 17
    .line 18
    new-instance v3, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v4, v0, LW1/l;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Landroid/view/View;

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    sub-int/2addr v4, v3

    .line 41
    const/4 v3, 0x0

    .line 42
    if-gez v4, :cond_0

    .line 43
    .line 44
    move v4, v3

    .line 45
    :cond_0
    iget v6, v0, LW1/l;->a:I

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x1

    .line 49
    if-eqz v6, :cond_3

    .line 50
    .line 51
    add-int/lit16 v6, v6, -0x96

    .line 52
    .line 53
    if-ge v5, v6, :cond_1

    .line 54
    .line 55
    move v6, v8

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v6, v3

    .line 58
    :goto_0
    invoke-virtual {v2}, LP5/S;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    check-cast v9, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    if-eq v6, v9, :cond_3

    .line 69
    .line 70
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v2, v7, v6}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, LP5/S;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v9, v1, LR4/k1;->t:Lj5/d;

    .line 87
    .line 88
    if-eqz v9, :cond_2

    .line 89
    .line 90
    iget-object v9, v9, Lj5/d;->l:LP5/S;

    .line 91
    .line 92
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9, v7, v6}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_2
    iget-object v6, v1, LR4/k1;->t:Lj5/d;

    .line 99
    .line 100
    iget-object v6, v6, Lj5/d;->n:LP5/S;

    .line 101
    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v7, v9}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_3
    iget-object v6, v1, LR4/k1;->d:LR4/i;

    .line 113
    .line 114
    if-eqz v6, :cond_4

    .line 115
    .line 116
    iget-object v6, v6, LR4/i;->x:Ljava/lang/Boolean;

    .line 117
    .line 118
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-static {v6, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move v6, v3

    .line 126
    :goto_1
    if-eqz v6, :cond_5

    .line 127
    .line 128
    invoke-virtual {v2}, LP5/S;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-nez v2, :cond_6

    .line 139
    .line 140
    :cond_5
    move v3, v8

    .line 141
    :cond_6
    if-eqz v3, :cond_7

    .line 142
    .line 143
    iput v5, v0, LW1/l;->a:I

    .line 144
    .line 145
    iget-object v0, v1, LR4/k1;->t:Lj5/d;

    .line 146
    .line 147
    iget-object v0, v0, Lj5/d;->n:LP5/S;

    .line 148
    .line 149
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v7, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_7
    return-void

    .line 160
    :pswitch_0
    iget-object v0, p0, LC0/j;->r:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, LC0/A;

    .line 163
    .line 164
    invoke-virtual {v0}, LC0/A;->P()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
