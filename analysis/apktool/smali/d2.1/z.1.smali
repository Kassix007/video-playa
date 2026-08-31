.class public abstract Ld2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ld2/A;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld2/A;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ld2/z;->a:Ld2/A;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Ld2/z;->b:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b(I)J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public abstract c(Ld2/V;I)V
.end method

.method public abstract d(Landroid/view/ViewGroup;)Ld2/V;
.end method
