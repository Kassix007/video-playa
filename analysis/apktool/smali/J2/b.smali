.class public final LJ2/b;
.super Lq6/o;
.source "SourceFile"


# instance fields
.field public final synthetic r:I

.field public s:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lq6/G;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ2/b;->r:I

    invoke-direct {p0, p1}, Lq6/o;-><init>(Lq6/G;)V

    return-void
.end method


# virtual methods
.method public final F(JLq6/g;)J
    .locals 1

    .line 1
    iget v0, p0, LJ2/b;->r:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lq6/o;->F(JLq6/g;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-wide p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    iput-object p1, p0, LJ2/b;->s:Ljava/lang/Exception;

    .line 13
    .line 14
    throw p1

    .line 15
    :pswitch_0
    :try_start_1
    invoke-super {p0, p1, p2, p3}, Lq6/o;->F(JLq6/g;)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 19
    return-wide p1

    .line 20
    :catch_1
    move-exception p1

    .line 21
    iput-object p1, p0, LJ2/b;->s:Ljava/lang/Exception;

    .line 22
    .line 23
    throw p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
