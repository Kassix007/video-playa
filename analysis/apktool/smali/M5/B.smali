.class public LM5/B;
.super LM5/a;
.source "SourceFile"


# instance fields
.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Lq5/h;ZI)V
    .locals 0

    .line 1
    iput p3, p0, LM5/B;->t:I

    invoke-direct {p0, p1, p2}, LM5/a;-><init>(Lq5/h;Z)V

    return-void
.end method


# virtual methods
.method public F(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget v0, p0, LM5/B;->t:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LM5/i0;->F(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p0, LM5/a;->s:Lq5/h;

    .line 12
    .line 13
    invoke-static {p1, v0}, LM5/y;->p(Ljava/lang/Throwable;Lq5/h;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
