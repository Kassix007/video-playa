.class public abstract Lr/M;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Object;

.field public static final b:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v1, Lr/M;->a:[Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v1, Lr/C;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lr/C;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lr/M;->b:Lr/C;

    .line 12
    .line 13
    return-void
.end method
