.class public abstract LU5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LE4/f;

    .line 2
    .line 3
    const-string v1, "NO_OWNER"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LE4/f;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LU5/d;->a:LE4/f;

    .line 10
    .line 11
    return-void
.end method
