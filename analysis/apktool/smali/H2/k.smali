.class public final LH2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH2/i;
.implements LY2/c;


# instance fields
.field public final synthetic a:I

.field public final b:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LH2/k;->a:I

    iput-boolean p2, p0, LH2/k;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget v0, p0, LH2/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LH2/k;->b:Z

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget-boolean v0, p0, LH2/k;->b:Z

    .line 10
    .line 11
    return v0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(LV2/h;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, LH2/k;->b:Z

    .line 2
    .line 3
    return p1
.end method

.method public c(LE2/h;)Z
    .locals 0

    .line 1
    iget-boolean p1, p0, LH2/k;->b:Z

    .line 2
    .line 3
    return p1
.end method
