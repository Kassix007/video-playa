.class public final synthetic Lg5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LW1/l;


# direct methods
.method public synthetic constructor <init>(LW1/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg5/d;->q:I

    iput-object p1, p0, Lg5/d;->r:LW1/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg5/d;->q:I

    .line 2
    .line 3
    check-cast p1, Lm5/y;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lg5/d;->r:LW1/l;

    .line 9
    .line 10
    iget-object v0, p1, LW1/l;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/view/ViewTreeObserver;

    .line 13
    .line 14
    iget-object p1, p1, LW1/l;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, LC0/j;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object p1, p0, Lg5/d;->r:LW1/l;

    .line 25
    .line 26
    iget-object v0, p1, LW1/l;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/view/ViewTreeObserver;

    .line 29
    .line 30
    iget-object p1, p1, LW1/l;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, LC0/j;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
