.class public final Ly4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/c;


# instance fields
.field public final synthetic q:I

.field public final r:Li1/a;


# direct methods
.method public synthetic constructor <init>(Li1/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly4/d;->q:I

    iput-object p1, p0, Ly4/d;->r:Li1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ly4/d;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly4/d;->r:Li1/a;

    .line 7
    .line 8
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LC3/b;

    .line 11
    .line 12
    iget-object v0, v0, LC3/b;->a:Landroid/content/Context;

    .line 13
    .line 14
    new-instance v1, Ly4/k;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ly4/k;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    iget-object v0, p0, Ly4/d;->r:Li1/a;

    .line 21
    .line 22
    iget-object v0, v0, Li1/a;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LC3/b;

    .line 25
    .line 26
    iget-object v0, v0, LC3/b;->a:Landroid/content/Context;

    .line 27
    .line 28
    new-instance v1, Ly4/c;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ly4/c;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
