.class public final Lcom/google/android/material/datepicker/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/k;->q:I

    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/datepicker/k;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ln4/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Ln4/c;->getItemData()Ll/n;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lb4/b;

    .line 15
    .line 16
    iget-object v1, v0, Ln4/e;->U:Ll/l;

    .line 17
    .line 18
    iget-object v0, v0, Ln4/e;->T:Ln4/g;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, p1, v0, v2}, Ll/l;->q(Landroid/view/MenuItem;Ll/x;I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {p1, v0}, Ll/n;->setChecked(Z)Landroid/view/MenuItem;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 35
    .line 36
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->e0:Lm/T0;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object p1, p1, Lm/T0;->r:Ll/n;

    .line 43
    .line 44
    :goto_0
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ll/n;->collapseActionView()Z

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :pswitch_1
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lk/a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lk/a;->a()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lh/e;

    .line 61
    .line 62
    iget-object v1, v0, Lh/e;->g:Landroid/widget/Button;

    .line 63
    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    iget-object v1, v0, Lh/e;->i:Landroid/os/Message;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iget-object v1, v0, Lh/e;->j:Landroid/widget/Button;

    .line 76
    .line 77
    if-ne p1, v1, :cond_4

    .line 78
    .line 79
    iget-object v1, v0, Lh/e;->l:Landroid/os/Message;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    iget-object v1, v0, Lh/e;->m:Landroid/widget/Button;

    .line 89
    .line 90
    if-ne p1, v1, :cond_5

    .line 91
    .line 92
    iget-object p1, v0, Lh/e;->o:Landroid/os/Message;

    .line 93
    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    const/4 p1, 0x0

    .line 102
    :goto_1
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 105
    .line 106
    .line 107
    :cond_6
    iget-object p1, v0, Lh/e;->C:Lh/c;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    iget-object v0, v0, Lh/e;->b:Lh/f;

    .line 111
    .line 112
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/k;->r:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lcom/google/android/material/datepicker/l;

    .line 123
    .line 124
    iget v0, p1, Lcom/google/android/material/datepicker/l;->o0:I

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    const/4 v2, 0x2

    .line 128
    if-ne v0, v2, :cond_7

    .line 129
    .line 130
    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/l;->H(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    if-ne v0, v1, :cond_8

    .line 135
    .line 136
    invoke-virtual {p1, v2}, Lcom/google/android/material/datepicker/l;->H(I)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_2
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
